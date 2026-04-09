.class public final LU9/f$a;
.super LU9/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LU9/f$a;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU9/f$a;

    invoke-direct {v0}, LU9/f$a;-><init>()V

    sput-object v0, LU9/f$a;->a:LU9/f$a;

    const-string/jumbo v0, "authenticator"

    sput-object v0, LU9/f$a;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LU9/f;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, LU9/f$a;->b:Ljava/lang/String;

    return-object v0
.end method
