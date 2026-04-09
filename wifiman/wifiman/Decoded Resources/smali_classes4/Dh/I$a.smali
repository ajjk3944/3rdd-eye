.class public final LDh/I$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDh/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LDh/I$a;

.field private static final b:LBh/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LDh/I$a;

    invoke-direct {v0}, LDh/I$a;-><init>()V

    sput-object v0, LDh/I$a;->a:LDh/I$a;

    new-instance v0, LBh/F;

    const-string v1, "PackageViewDescriptorFactory"

    invoke-direct {v0, v1}, LBh/F;-><init>(Ljava/lang/String;)V

    sput-object v0, LDh/I$a;->b:LBh/F;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LBh/F;
    .locals 1

    sget-object v0, LDh/I$a;->b:LBh/F;

    return-object v0
.end method
