.class final LC/E$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/E;->a(Lw/v;FLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/E;

.field final synthetic b:Lw/v;


# direct methods
.method constructor <init>(LC/E;Lw/v;)V
    .locals 0

    iput-object p1, p0, LC/E$b;->a:LC/E;

    iput-object p2, p0, LC/E$b;->b:Lw/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    iget-object v0, p0, LC/E$b;->a:LC/E;

    invoke-virtual {v0}, LC/E;->d()LC/C;

    move-result-object v0

    invoke-virtual {v0}, LC/C;->H()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LC/E$b;->a:LC/E;

    invoke-virtual {v0}, LC/E;->d()LC/C;

    move-result-object v0

    invoke-virtual {v0}, LC/C;->H()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    iget-object v0, p0, LC/E$b;->a:LC/E;

    invoke-virtual {v0}, LC/E;->d()LC/C;

    move-result-object v0

    invoke-virtual {v0}, LC/C;->v()I

    move-result v0

    add-int/2addr p1, v0

    iget-object v0, p0, LC/E$b;->a:LC/E;

    invoke-virtual {v0}, LC/E;->d()LC/C;

    move-result-object v0

    iget-object v1, p0, LC/E$b;->b:Lw/v;

    invoke-virtual {v0, v1, p1}, LC/C;->k0(Lw/v;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LC/E$b;->a(F)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
