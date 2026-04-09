.class public abstract LQ0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ0/k$a;,
        LQ0/k$b;
    }
.end annotation


# static fields
.field public static final b:LQ0/k$a;

.field private static final c:LQ0/O;

.field private static final d:LQ0/E;

.field private static final e:LQ0/E;

.field private static final f:LQ0/E;

.field private static final g:LQ0/E;


# instance fields
.field private final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LQ0/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ0/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQ0/k;->b:LQ0/k$a;

    new-instance v0, LQ0/h;

    invoke-direct {v0}, LQ0/h;-><init>()V

    sput-object v0, LQ0/k;->c:LQ0/O;

    new-instance v0, LQ0/E;

    const-string v1, "sans-serif"

    const-string v2, "FontFamily.SansSerif"

    invoke-direct {v0, v1, v2}, LQ0/E;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LQ0/k;->d:LQ0/E;

    new-instance v0, LQ0/E;

    const-string v1, "serif"

    const-string v2, "FontFamily.Serif"

    invoke-direct {v0, v1, v2}, LQ0/E;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LQ0/k;->e:LQ0/E;

    new-instance v0, LQ0/E;

    const-string v1, "monospace"

    const-string v2, "FontFamily.Monospace"

    invoke-direct {v0, v1, v2}, LQ0/E;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LQ0/k;->f:LQ0/E;

    new-instance v0, LQ0/E;

    const-string v1, "cursive"

    const-string v2, "FontFamily.Cursive"

    invoke-direct {v0, v1, v2}, LQ0/E;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LQ0/k;->g:LQ0/E;

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LQ0/k;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LQ0/k;-><init>(Z)V

    return-void
.end method

.method public static final synthetic b()LQ0/O;
    .locals 1

    sget-object v0, LQ0/k;->c:LQ0/O;

    return-object v0
.end method
