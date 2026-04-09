.class public final Lb1/B;
.super Lg1/g;
.source "SourceFile"


# instance fields
.field private final l:LY0/d;

.field private m:J

.field private n:LY0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY0/d;)V
    .locals 6

    invoke-direct {p0}, Lg1/g;-><init>()V

    iput-object p1, p0, Lb1/B;->l:LY0/d;

    const/16 v4, 0xf

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v0

    iput-wide v0, p0, Lb1/B;->m:J

    sget-object p1, LY0/t;->Ltr:LY0/t;

    iput-object p1, p0, Lb1/B;->n:LY0/t;

    new-instance p1, Lb1/A;

    invoke-direct {p1, p0}, Lb1/A;-><init>(Lb1/B;)V

    invoke-virtual {p0, p1}, Lg1/g;->v(Lg1/c;)V

    return-void
.end method

.method public static synthetic D(Lb1/B;F)F
    .locals 0

    invoke-static {p0, p1}, Lb1/B;->E(Lb1/B;F)F

    move-result p0

    return p0
.end method

.method private static final E(Lb1/B;F)F
    .locals 0

    iget-object p0, p0, Lb1/B;->l:LY0/d;

    invoke-interface {p0}, LY0/d;->getDensity()F

    move-result p0

    mul-float/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final F()J
    .locals 2

    iget-wide v0, p0, Lb1/B;->m:J

    return-wide v0
.end method

.method public final G(J)V
    .locals 0

    iput-wide p1, p0, Lb1/B;->m:J

    return-void
.end method

.method public e(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, LY0/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/B;->l:LY0/d;

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    invoke-interface {v0, p1}, LY0/d;->x1(F)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lg1/g;->e(Ljava/lang/Object;)I

    move-result p1

    :goto_0
    return p1
.end method
