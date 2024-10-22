public class RiskyItems {
  public static final Item SOLDIERS_SYRINGE = new Item(new QuiltItemSettings());

  public static void register(ModContainer mod) {
    Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "soldiers_syringe"), SOLDIERS_SYRINGE);
  }
}