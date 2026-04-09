.class public LB5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ls3/i;

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field static final e:Ljava/lang/String;


# instance fields
.field private final a:LA5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls3/i;

    const-string/jumbo v1, "ModelFileHelper"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Ls3/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, LB5/a;->b:Ls3/i;

    const-string/jumbo v0, "translate"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "com.google.mlkit.%s.models"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LB5/a;->c:Ljava/lang/String;

    const-string/jumbo v0, "custom"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LB5/a;->d:Ljava/lang/String;

    const-string/jumbo v0, "base"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LB5/a;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LA5/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB5/a;->a:LA5/h;

    return-void
.end method
