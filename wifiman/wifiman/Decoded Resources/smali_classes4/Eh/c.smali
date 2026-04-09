.class public final LEh/c;
.super LBh/w0;
.source "SourceFile"


# static fields
.field public static final c:LEh/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LEh/c;

    invoke-direct {v0}, LEh/c;-><init>()V

    sput-object v0, LEh/c;->c:LEh/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const-string v0, "protected_static"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LBh/w0;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "protected/*protected static*/"

    return-object v0
.end method

.method public d()LBh/w0;
    .locals 1

    sget-object v0, LBh/v0$g;->c:LBh/v0$g;

    return-object v0
.end method
