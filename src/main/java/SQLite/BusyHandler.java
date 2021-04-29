package SQLite;

import org.moe.svm.anns.JNI;

/**
 * Callback interface for SQLite's user defined busy handler.
 */

public interface BusyHandler {

    /**
     * Invoked when a table is locked by another process
     * or thread. The method should return true for waiting
     * until the table becomes unlocked, or false in order
     * to abandon the action.<BR><BR>
     *
     * @param table the name of the locked table
     * @param count number of times the table was locked
     * @return true if still blocked
     */

    @JNI
    public boolean busy(String table, int count);
}
