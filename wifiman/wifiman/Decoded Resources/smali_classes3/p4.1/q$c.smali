.class public final Lp4/q$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp4/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lp4/q$c;

.field public static final c:Lp4/q$c;

.field public static final d:Lp4/q$c;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp4/q$c;

    const-string/jumbo v1, "TINK"

    invoke-direct {v0, v1}, Lp4/q$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp4/q$c;->b:Lp4/q$c;

    new-instance v0, Lp4/q$c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lp4/q$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp4/q$c;->c:Lp4/q$c;

    new-instance v0, Lp4/q$c;

    const-string/jumbo v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lp4/q$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp4/q$c;->d:Lp4/q$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/q$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp4/q$c;->a:Ljava/lang/String;

    return-object v0
.end method
