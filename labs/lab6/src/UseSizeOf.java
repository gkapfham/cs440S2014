import com.vladium.utils.IObjectProfileNode;
import com.vladium.utils.ObjectProfileFilters;
import com.vladium.utils.ObjectProfileVisitors;
import com.vladium.utils.ObjectProfiler;

import org.github.jamm.MemoryMeter;

public class UseSizeOf {

    public static void main(String[] args) {
        // Use the Roubtsox technique to calculate the size of primitives
        int intVar         = 10;
        Integer integerVar = new Integer(10);
        IObjectProfileNode profile = ObjectProfiler.profile (intVar);

        System.out.println ("obj size = " + profile.size () + " bytes");
        System.out.println (profile.dump ());
        System.out.println ();

        double doubleVar = 3.4;
        profile = ObjectProfiler.profile (doubleVar);

        System.out.println ("obj size = " + profile.size () + " bytes");
        System.out.println (profile.dump ());
        System.out.println ();

        // Use the MemoryMeter technique to calculate the size of primitives
        MemoryMeter meter = new MemoryMeter();
        System.out.println(meter.measure(intVar));
        System.out.println(meter.measureDeep(intVar));
    }

}
