.class public final LH/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LH/k$a;

.field private static final b:LH/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LH/k$a;

    invoke-direct {v0}, LH/k$a;-><init>()V

    sput-object v0, LH/k$a;->a:LH/k$a;

    new-instance v0, LH/k$b;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, LH/k$b;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LH/k$a;->b:LH/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LH/k;
    .locals 1

    sget-object v0, LH/k$a;->b:LH/k;

    return-object v0
.end method
