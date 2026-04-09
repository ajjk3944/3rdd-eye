.class public final Lo4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lo4/k;

.field public static final c:Lo4/k;

.field public static final d:Lo4/k;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo4/k;

    const-string/jumbo v1, "ENABLED"

    invoke-direct {v0, v1}, Lo4/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo4/k;->b:Lo4/k;

    new-instance v0, Lo4/k;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, Lo4/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo4/k;->c:Lo4/k;

    new-instance v0, Lo4/k;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, Lo4/k;-><init>(Ljava/lang/String;)V

    sput-object v0, Lo4/k;->d:Lo4/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo4/k;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo4/k;->a:Ljava/lang/String;

    return-object v0
.end method
