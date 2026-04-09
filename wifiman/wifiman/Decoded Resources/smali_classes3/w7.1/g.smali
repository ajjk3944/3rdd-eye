.class public final Lw7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Lu7/a;
    .locals 12

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v2

    new-instance v3, LC7/b;

    invoke-direct {v3}, LC7/b;-><init>()V

    new-instance v5, Lz7/y;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {v5, v0, v1, v0}, Lz7/y;-><init>(Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lz7/g;

    const/16 v0, 0x2711

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v6, Lw7/g$a;->a:Lw7/g$a;

    const/16 v9, 0x80

    const/4 v10, 0x0

    const-string/jumbo v1, "UiPassive"

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lz7/g;-><init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v11
.end method
