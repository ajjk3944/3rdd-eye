.class final LI/i1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/i1$b$b;
    }
.end annotation


# static fields
.field public static final g:LI/i1$b$b;

.field private static final h:LT/n1;


# instance fields
.field private final a:LY0/d;

.field private final b:LY0/t;

.field private final c:LQ0/k$b;

.field private final d:J

.field private final e:F

.field private final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI/i1$b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI/i1$b$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LI/i1$b;->g:LI/i1$b$b;

    new-instance v0, LI/i1$b$a;

    invoke-direct {v0}, LI/i1$b$a;-><init>()V

    sput-object v0, LI/i1$b;->h:LT/n1;

    return-void
.end method

.method private constructor <init>(LY0/d;LY0/t;LQ0/k$b;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LI/i1$b;->a:LY0/d;

    .line 4
    iput-object p2, p0, LI/i1$b;->b:LY0/t;

    .line 5
    iput-object p3, p0, LI/i1$b;->c:LQ0/k$b;

    .line 6
    iput-wide p4, p0, LI/i1$b;->d:J

    .line 7
    invoke-interface {p1}, LY0/d;->getDensity()F

    move-result p2

    iput p2, p0, LI/i1$b;->e:F

    .line 8
    invoke-interface {p1}, LY0/l;->y()F

    move-result p1

    iput p1, p0, LI/i1$b;->f:F

    return-void
.end method

.method public synthetic constructor <init>(LY0/d;LY0/t;LQ0/k$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LI/i1$b;-><init>(LY0/d;LY0/t;LQ0/k$b;J)V

    return-void
.end method

.method public static final synthetic a()LT/n1;
    .locals 1

    sget-object v0, LI/i1$b;->h:LT/n1;

    return-object v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-wide v0, p0, LI/i1$b;->d:J

    return-wide v0
.end method

.method public final c()LY0/d;
    .locals 1

    iget-object v0, p0, LI/i1$b;->a:LY0/d;

    return-object v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, LI/i1$b;->e:F

    return v0
.end method

.method public final e()LQ0/k$b;
    .locals 1

    iget-object v0, p0, LI/i1$b;->c:LQ0/k$b;

    return-object v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, LI/i1$b;->f:F

    return v0
.end method

.method public final g()LY0/t;
    .locals 1

    iget-object v0, p0, LI/i1$b;->b:LY0/t;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MeasureInputs(density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$b;->a:LY0/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", densityValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LI/i1$b;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fontScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LI/i1$b;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", layoutDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$b;->b:LY0/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontFamilyResolver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI/i1$b;->c:LQ0/k$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", constraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LI/i1$b;->d:J

    invoke-static {v1, v2}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
