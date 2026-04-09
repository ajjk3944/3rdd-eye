.class final LV6/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV6/m;->f(Lmh/a;Landroidx/compose/ui/e;LV6/p;Lmh/p;Lmh/p;Lmh/a;LT6/a;LS6/k;ZLmh/l;Lr0/d;Lmh/r;Lmh/s;Lmh/r;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LV6/m$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV6/m$b;

    invoke-direct {v0}, LV6/m$b;-><init>()V

    sput-object v0, LV6/m$b;->a:LV6/m$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)Lcom/bumptech/glide/request/f;
    .locals 3

    const v0, 0x3f8a6608

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.skydoves.landscapist.glide.GlideImage.<anonymous> (GlideImage.kt:106)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LV6/r;->a:LV6/r;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LV6/r;->c(LT/l;I)Lcom/bumptech/glide/request/f;

    move-result-object p2

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p1}, LT/l;->J()V

    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LV6/m$b;->a(LT/l;I)Lcom/bumptech/glide/request/f;

    move-result-object p1

    return-object p1
.end method
