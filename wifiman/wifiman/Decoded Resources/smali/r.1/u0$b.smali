.class final Lr/u0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lr/u0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr/u0$b;

    invoke-direct {v0}, Lr/u0$b;-><init>()V

    sput-object v0, Lr/u0$b;->a:Lr/u0$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/n;)J
    .locals 2

    invoke-virtual {p1}, Lr/n;->f()F

    move-result v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-virtual {p1}, Lr/n;->g()F

    move-result p1

    invoke-static {p1}, LY0/h;->j(F)F

    move-result p1

    invoke-static {v0, p1}, LY0/i;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lr/n;

    invoke-virtual {p0, p1}, Lr/u0$b;->a(Lr/n;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/j;->a(J)LY0/j;

    move-result-object p1

    return-object p1
.end method
