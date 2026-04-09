.class final synthetic LO/e$b;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/e;->b(Landroidx/compose/ui/e;LO/g;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "onRelease$material_release(F)F"

    const/4 v6, 0x4

    const/4 v1, 0x2

    const-class v3, LO/g;

    const-string v4, "onRelease"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(FLdh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/a;->a:Ljava/lang/Object;

    check-cast v0, LO/g;

    invoke-static {v0, p1, p2}, LO/e;->a(LO/g;FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LO/e$b;->a(FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
