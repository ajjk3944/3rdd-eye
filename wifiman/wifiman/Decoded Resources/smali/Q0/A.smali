.class public final LQ0/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ0/A$a;
    }
.end annotation


# static fields
.field public static final b:LQ0/A$a;

.field private static final c:LQ0/A;

.field private static final d:LQ0/A;

.field private static final e:LQ0/A;

.field private static final f:LQ0/A;

.field private static final g:LQ0/A;

.field private static final h:LQ0/A;

.field private static final i:LQ0/A;

.field private static final j:LQ0/A;

.field private static final k:LQ0/A;

.field private static final l:LQ0/A;

.field private static final m:LQ0/A;

.field private static final n:LQ0/A;

.field private static final o:LQ0/A;

.field private static final p:LQ0/A;

.field private static final q:LQ0/A;

.field private static final r:LQ0/A;

.field private static final s:LQ0/A;

.field private static final t:LQ0/A;

.field private static final u:Ljava/util/List;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, LQ0/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ0/A$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ0/A;->b:LQ0/A$a;

    new-instance v2, LQ0/A;

    const/16 v0, 0x64

    invoke-direct {v2, v0}, LQ0/A;-><init>(I)V

    sput-object v2, LQ0/A;->c:LQ0/A;

    new-instance v3, LQ0/A;

    const/16 v0, 0xc8

    invoke-direct {v3, v0}, LQ0/A;-><init>(I)V

    sput-object v3, LQ0/A;->d:LQ0/A;

    new-instance v4, LQ0/A;

    const/16 v0, 0x12c

    invoke-direct {v4, v0}, LQ0/A;-><init>(I)V

    sput-object v4, LQ0/A;->e:LQ0/A;

    new-instance v5, LQ0/A;

    const/16 v0, 0x190

    invoke-direct {v5, v0}, LQ0/A;-><init>(I)V

    sput-object v5, LQ0/A;->f:LQ0/A;

    new-instance v6, LQ0/A;

    const/16 v0, 0x1f4

    invoke-direct {v6, v0}, LQ0/A;-><init>(I)V

    sput-object v6, LQ0/A;->g:LQ0/A;

    new-instance v7, LQ0/A;

    const/16 v0, 0x258

    invoke-direct {v7, v0}, LQ0/A;-><init>(I)V

    sput-object v7, LQ0/A;->h:LQ0/A;

    new-instance v8, LQ0/A;

    const/16 v0, 0x2bc

    invoke-direct {v8, v0}, LQ0/A;-><init>(I)V

    sput-object v8, LQ0/A;->i:LQ0/A;

    new-instance v9, LQ0/A;

    const/16 v0, 0x320

    invoke-direct {v9, v0}, LQ0/A;-><init>(I)V

    sput-object v9, LQ0/A;->j:LQ0/A;

    new-instance v10, LQ0/A;

    const/16 v0, 0x384

    invoke-direct {v10, v0}, LQ0/A;-><init>(I)V

    sput-object v10, LQ0/A;->k:LQ0/A;

    sput-object v2, LQ0/A;->l:LQ0/A;

    sput-object v3, LQ0/A;->m:LQ0/A;

    sput-object v4, LQ0/A;->n:LQ0/A;

    sput-object v5, LQ0/A;->o:LQ0/A;

    sput-object v6, LQ0/A;->p:LQ0/A;

    sput-object v7, LQ0/A;->q:LQ0/A;

    sput-object v8, LQ0/A;->r:LQ0/A;

    sput-object v9, LQ0/A;->s:LQ0/A;

    sput-object v10, LQ0/A;->t:LQ0/A;

    filled-new-array/range {v2 .. v10}, [LQ0/A;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LQ0/A;->u:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LQ0/A;->a:I

    const/4 v0, 0x1

    if-gt v0, p1, :cond_0

    const/16 v0, 0x3e9

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Font weight can be in range [1, 1000]. Current value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic a()LQ0/A;
    .locals 1

    sget-object v0, LQ0/A;->t:LQ0/A;

    return-object v0
.end method

.method public static final synthetic b()LQ0/A;
    .locals 1

    sget-object v0, LQ0/A;->r:LQ0/A;

    return-object v0
.end method

.method public static final synthetic c()LQ0/A;
    .locals 1

    sget-object v0, LQ0/A;->n:LQ0/A;

    return-object v0
.end method

.method public static final synthetic d()LQ0/A;
    .locals 1

    sget-object v0, LQ0/A;->p:LQ0/A;

    return-object v0
.end method

.method public static final synthetic g()LQ0/A;
    .locals 1

    sget-object v0, LQ0/A;->o:LQ0/A;

    return-object v0
.end method

.method public static final synthetic h()LQ0/A;
    .locals 1

    sget-object v0, LQ0/A;->f:LQ0/A;

    return-object v0
.end method

.method public static final synthetic j()LQ0/A;
    .locals 1

    sget-object v0, LQ0/A;->g:LQ0/A;

    return-object v0
.end method

.method public static final synthetic l()LQ0/A;
    .locals 1

    sget-object v0, LQ0/A;->h:LQ0/A;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LQ0/A;

    invoke-virtual {p0, p1}, LQ0/A;->n(LQ0/A;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LQ0/A;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LQ0/A;->a:I

    check-cast p1, LQ0/A;

    iget p1, p1, LQ0/A;->a:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LQ0/A;->a:I

    return v0
.end method

.method public n(LQ0/A;)I
    .locals 1

    iget v0, p0, LQ0/A;->a:I

    iget p1, p1, LQ0/A;->a:I

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p1

    return p1
.end method

.method public final p()I
    .locals 1

    iget v0, p0, LQ0/A;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FontWeight(weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LQ0/A;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
