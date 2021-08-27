package es.geekshubs.academy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DocumentoTest {

  private Documento documento;

  @Before
  public void setUp() throws Exception {
    this.documento = new Documento();
  }

  @After
  public void tearDown() throws Exception {
    this.documento = null;
  }

  @Test public void test01 () {
    Boolean expected = false;
    Boolean result = documento.apply(null);
    assertEquals(expected, result);
  }

  @Test public void test02 () {
    Boolean expected = false;
    Boolean result = documento.apply("");
    assertEquals(expected, result);
  }

  @Test public void test03 () {
    Boolean expected = false;
    Boolean result = documento.apply("44878956X");
    assertEquals(expected, result);
  }

  @Test public void test04 () {
    Boolean expected = false;
    Boolean result = documento.apply("44878956x");
    assertEquals(expected, result);
  }

  @Test public void test05 () {
    Boolean expected = false;
    Boolean result = documento.apply("0000000");
    assertEquals(expected, result);
  }

  @Test public void test06 () {
    Boolean expected = false;
    Boolean result = documento.apply("X0000000");
    assertEquals(expected, result);
  }

  @Test public void test07 () {
    Boolean expected = false;
    Boolean result = documento.apply("000X0000");
    assertEquals(expected, result);
  }

  @Test public void test08 () {
    Boolean expected = false;
    Boolean result = documento.apply("00000000s");
    assertEquals(expected, result);
  }

  @Test public void test09 () {
    Boolean expected = false;
    Boolean result = documento.apply("03200000s");
    assertEquals(expected, result);
  }

  @Test public void test10 () {
    Boolean expected = false;
    Boolean result = documento.apply("0320000Ss");
    assertEquals(expected, result);
  }

  @Test public void test11 () {
    Boolean expected = false;
    Boolean result = documento.apply("S");
    assertEquals(expected, result);
  }

  @Test public void test12 () {
    Boolean expected = false;
    Boolean result = documento.apply("s");
    assertEquals(expected, result);
  }

  @Test public void test13 () {
    Boolean expected = false;
    Boolean result = documento.apply("000c0000");
    assertEquals(expected, result);
  }

  @Test public void test14 () {
    Boolean expected = true;
    Boolean result = documento.apply("68741024G");
    assertEquals(expected, result);
  }

  @Test public void test15 () {
    Boolean expected = true;
    Boolean result = documento.apply("96731267Y");
    assertEquals(expected, result);
  }

  @Test public void test16 () {
    Boolean expected = true;
    Boolean result = documento.apply("65973775T");
    assertEquals(expected, result);
  }

  @Test public void test17 () {
    Boolean expected = true;
    Boolean result = documento.apply("01893995Z");
    assertEquals(expected, result);
  }

  @Test public void test18 () {
    Boolean expected = true;
    Boolean result = documento.apply("12322160W");
    assertEquals(expected, result);
  }

  @Test public void test19 () {
    Boolean expected = true;
    Boolean result = documento.apply("55491653J");
    assertEquals(expected, result);
  }

  @Test public void test20 () {
    Boolean expected = false;
    Boolean result = documento.apply("55491653Ñ");
    assertEquals(expected, result);
  }

}