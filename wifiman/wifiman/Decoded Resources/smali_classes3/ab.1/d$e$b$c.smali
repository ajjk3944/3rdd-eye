.class public final Lab/d$e$b$c;
.super Lab/d$e$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lab/d$e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lab/d$e$b$c;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lab/d$e$b$c;

    invoke-direct {v0}, Lab/d$e$b$c;-><init>()V

    sput-object v0, Lab/d$e$b$c;->b:Lab/d$e$b$c;

    const-string/jumbo v0, "mobile-setup-wizard-plugin"

    sput-object v0, Lab/d$e$b$c;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lab/d$e$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lab/d$e$b$c;->c:Ljava/lang/String;

    return-object v0
.end method
