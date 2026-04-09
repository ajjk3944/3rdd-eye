.class final Lq/h$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq/h$a;->a(Ln0/c;)Lr/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lq/h$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq/h$a$a;

    invoke-direct {v0}, Lq/h$a$a;-><init>()V

    sput-object v0, Lq/h$a$a;->a:Lq/h$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Lr/p;
    .locals 3

    sget-object v0, Ln0/g;->a:Ln0/g;

    invoke-virtual {v0}, Ln0/g;->t()Ln0/c;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lm0/v0;->i(JLn0/c;)J

    move-result-wide p1

    invoke-static {p1, p2}, Lm0/v0;->r(J)F

    move-result v0

    invoke-static {p1, p2}, Lm0/v0;->q(J)F

    move-result v1

    invoke-static {p1, p2}, Lm0/v0;->o(J)F

    move-result v2

    invoke-static {p1, p2}, Lm0/v0;->n(J)F

    move-result p1

    new-instance p2, Lr/p;

    invoke-direct {p2, p1, v0, v1, v2}, Lr/p;-><init>(FFFF)V

    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lm0/v0;

    invoke-virtual {p1}, Lm0/v0;->u()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lq/h$a$a;->a(J)Lr/p;

    move-result-object p1

    return-object p1
.end method
