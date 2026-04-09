.class public final LTe/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LTe/i;

.field public static b:Lmh/q;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LTe/i;

    invoke-direct {v0}, LTe/i;-><init>()V

    sput-object v0, LTe/i;->a:LTe/i;

    const/4 v0, 0x0

    sget-object v1, LTe/i$a;->a:LTe/i$a;

    const v2, -0x4c554c83

    invoke-static {v2, v0, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LTe/i;->b:Lmh/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lmh/q;
    .locals 1

    sget-object v0, LTe/i;->b:Lmh/q;

    return-object v0
.end method
