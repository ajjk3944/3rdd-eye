.class final Lw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/t;


# static fields
.field public static final a:Lw/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw/a;

    invoke-direct {v0}, Lw/a;-><init>()V

    sput-object v0, Lw/a;->a:Lw/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LY0/d;Ly0/n;J)J
    .locals 6

    invoke-virtual {p2}, Ly0/n;->c()Ljava/util/List;

    move-result-object p2

    sget-object p3, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p3}, Ll0/g$a;->c()J

    move-result-wide p3

    invoke-static {p3, p4}, Ll0/g;->d(J)Ll0/g;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly0/y;

    invoke-virtual {p3}, Ll0/g;->v()J

    move-result-wide v2

    invoke-virtual {v1}, Ly0/y;->m()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ll0/g;->r(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ll0/g;->v()J

    move-result-wide p2

    const/16 p4, 0x40

    int-to-float p4, p4

    invoke-static {p4}, LY0/h;->j(F)F

    move-result p4

    invoke-interface {p1, p4}, LY0/d;->d1(F)F

    move-result p1

    neg-float p1, p1

    invoke-static {p2, p3, p1}, Ll0/g;->s(JF)J

    move-result-wide p1

    return-wide p1
.end method
