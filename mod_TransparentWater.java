public class mod_TransparentWater extends BaseMod
{
	public static int waterOpacity = 0;

	public mod_TransparentWater()
	{
		to.B.f(waterOpacity);
		to.A.f(waterOpacity);
	}

	public String Version()
	{
		return "1.5_01";
	}
}
