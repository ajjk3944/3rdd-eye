.class public final LZh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZh/a$a;
    }
.end annotation


# static fields
.field public static final f:LZh/a$a;

.field private static final g:LZh/f;

.field private static final h:LZh/c;


# instance fields
.field private final a:LZh/c;

.field private final b:LZh/c;

.field private final c:LZh/f;

.field private final d:LZh/b;

.field private final e:LZh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZh/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZh/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LZh/a;->f:LZh/a$a;

    sget-object v0, LZh/h;->m:LZh/f;

    sput-object v0, LZh/a;->g:LZh/f;

    invoke-static {v0}, LZh/c;->k(LZh/f;)LZh/c;

    move-result-object v0

    const-string v1, "topLevel(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LZh/a;->h:LZh/c;

    return-void
.end method

.method private constructor <init>(LZh/c;LZh/c;LZh/f;LZh/b;LZh/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LZh/a;->a:LZh/c;

    .line 3
    iput-object p2, p0, LZh/a;->b:LZh/c;

    .line 4
    iput-object p3, p0, LZh/a;->c:LZh/f;

    .line 5
    iput-object p4, p0, LZh/a;->d:LZh/b;

    .line 6
    iput-object p5, p0, LZh/a;->e:LZh/c;

    return-void
.end method

.method public constructor <init>(LZh/c;LZh/f;)V
    .locals 7

    const-string v0, "packageName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callableName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    .line 7
    invoke-direct/range {v1 .. v6}, LZh/a;-><init>(LZh/c;LZh/c;LZh/f;LZh/b;LZh/c;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, LZh/a;

    const/4 v2, 0x0

    if-nez v1, :cond_2

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    iget-object v1, p0, LZh/a;->a:LZh/c;

    check-cast p1, LZh/a;

    iget-object v3, p1, LZh/a;->a:LZh/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LZh/a;->b:LZh/c;

    iget-object v3, p1, LZh/a;->b:LZh/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LZh/a;->c:LZh/f;

    iget-object p1, p1, LZh/a;->c:LZh/f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LZh/a;->a:LZh/c;

    invoke-virtual {v0}, LZh/c;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LZh/a;->b:LZh/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LZh/a;->c:LZh/f;

    invoke-virtual {v0}, LZh/f;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LZh/a;->a:LZh/c;

    invoke-virtual {v1}, LZh/c;->b()Ljava/lang/String;

    move-result-object v2

    const-string v1, "asString(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/16 v3, 0x2e

    const/16 v4, 0x2f

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/t;->K(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LZh/a;->b:LZh/c;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, LZh/a;->c:LZh/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
