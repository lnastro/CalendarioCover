/**
 * 
 */
package calendario;



import org.junit.Assert;
import org.junit.Test;

/**
 * @author Porfirio
 *
 */
public class TestWhiteBox {
  static {
    CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.ping();
  }

	public Assert ass;
	
	
	@Test
	public void testCalendWB1() {
		ass.assertEquals(Calendario.calend(29,"gennaio",2011),"Sabato");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[1]++;
	}
	@Test
	public void testCalendWB2() {
		ass.assertEquals(Calendario.calend(29,"marzo",2011),"Martedi");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[2]++;
	}
	@Test
	public void testCalendWB3() {
		ass.assertEquals(Calendario.calend(29,"maggio",2011),"Domenica");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[3]++;
	}
	@Test
	public void testCalendWB4() {
		ass.assertEquals(Calendario.calend(29,"luglio",2011),"Venerdi");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[4]++;
	}
	@Test
	public void testCalendWB5() {
		ass.assertEquals(Calendario.calend(29,"agosto",2011),"Lunedi");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[5]++;
	}
	@Test
	public void testCalendWB6() {
		ass.assertEquals(Calendario.calend(29,"ottobre",2011),"Sabato");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[6]++;
	}
	@Test
	public void testCalendWB7() {
		ass.assertEquals(Calendario.calend(29,"dicembre",2011),"Giovedi");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[7]++;
	}
	@Test
	public void testCalendWB8() {
		ass.assertEquals(Calendario.calend(28,"febbraio",2011),"Lunedi");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[8]++;
	}
	@Test
	public void testCalendWB9() {
		ass.assertEquals(Calendario.calend(17,"aprile",2011),"Domenica");
CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1.statements[9]++;
	}

}

class CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1 extends org.codecover.instrumentation.java.measurement.CounterContainer {

  static {
    org.codecover.instrumentation.java.measurement.ProtocolImpl.getInstance(org.codecover.instrumentation.java.measurement.CoverageResultLogFile.getInstance(null), "62dd34ea-8f58-4cb1-9993-98177e600ecc").addObservedContainer(new CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1 ());
  }
    public static long[] statements = new long[10];
    public static long[] branches = new long[0];
    public static long[] loops = new long[1];

  public CodeCoverCoverageCounter$zj3f3suz2m5qulcx30r2ikvko1 () {
    super("calendario.TestWhiteBox.java");
  }

  public static void ping() {/* nothing to do*/}

  public void reset() {
      for (int i = 1; i <= 9; i++) {
        statements[i] = 0L;
      }
      for (int i = 1; i <= -1; i++) {
        branches[i] = 0L;
      }
      for (int i = 1; i <= 0; i++) {
        loops[i] = 0L;
      }
  }

  public void serializeAndReset(org.codecover.instrumentation.measurement.CoverageCounterLog log) {
    log.startNamedSection("calendario.TestWhiteBox.java");
      for (int i = 1; i <= 9; i++) {
        if (statements[i] != 0L) {
          log.passCounter("S" + i, statements[i]);
          statements[i] = 0L;
        }
      }
      for (int i = 1; i <= -1; i++) {
        if (branches[i] != 0L) {
          log.passCounter("B"+ i, branches[i]);
          branches[i] = 0L;
        }
      }
      for (int i = 1; i <= 0; i++) {
        if (loops[i * 3 - 2] != 0L) {
          log.passCounter("L" + i + "-0", loops[i * 3 - 2]);
          loops[i * 3 - 2] = 0L;
        }
        if ( loops[i * 3 - 1] != 0L) {
          log.passCounter("L" + i + "-1", loops[i * 3 - 1]);
          loops[i * 3 - 1] = 0L;
        }
        if ( loops[i * 3] != 0L) {
          log.passCounter("L" + i + "-2", loops[i * 3]);
          loops[i * 3] = 0L;
        }
      }
  }
}

