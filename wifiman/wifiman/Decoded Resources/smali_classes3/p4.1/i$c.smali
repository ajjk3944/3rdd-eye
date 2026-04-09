.class public final Lp4/i$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lp4/i$c;

.field public static final c:Lp4/i$c;

.field public static final d:Lp4/i$c;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp4/i$c;

    const-string/jumbo v1, "TINK"

    invoke-direct {v0, v1}, Lp4/i$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp4/i$c;->b:Lp4/i$c;

    new-instance v0, Lp4/i$c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lp4/i$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp4/i$c;->c:Lp4/i$c;

    new-instance v0, Lp4/i$c;

    const-string/jumbo v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lp4/i$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp4/i$c;->d:Lp4/i$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/i$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lp4/i$c;->a:Ljava/lang/String;

    return-object v0
.end method
