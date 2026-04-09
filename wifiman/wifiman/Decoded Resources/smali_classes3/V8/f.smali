.class public final LV8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV8/e$a;


# instance fields
.field private final a:LG6/G;


# direct methods
.method public constructor <init>(LG6/G;)V
    .locals 1

    const-string/jumbo v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV8/f;->a:LG6/G;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LT8/b$b;)LT8/b;
    .locals 0

    check-cast p6, LV8/e$b;

    invoke-virtual/range {p0 .. p6}, LV8/f;->b(Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)LV8/e;

    move-result-object p1

    return-object p1
.end method

.method public b(Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)LV8/e;
    .locals 11

    const-string/jumbo v0, "hwAddress"

    move-object v3, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "readCharacteristic"

    move-object v5, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "writeCharacteristic"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "params"

    move-object/from16 v8, p6

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/k;

    move-object v10, p0

    iget-object v2, v10, LV8/f;->a:LG6/G;

    const/4 v9, 0x0

    move-object v1, v0

    move-object v4, p2

    move-object v6, p4

    invoke-direct/range {v1 .. v9}, LV8/k;-><init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
