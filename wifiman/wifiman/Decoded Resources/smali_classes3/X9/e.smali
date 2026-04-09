.class public final LX9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LX9/e;

.field public static b:Lmh/q;

.field public static c:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LX9/e;

    invoke-direct {v0}, LX9/e;-><init>()V

    sput-object v0, LX9/e;->a:LX9/e;

    sget-object v0, LX9/e$a;->a:LX9/e$a;

    const v1, 0x767caefc

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LX9/e;->b:Lmh/q;

    const v0, -0x69023e37

    sget-object v1, LX9/e$b;->a:LX9/e$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LX9/e;->c:Lmh/p;

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

    sget-object v0, LX9/e;->b:Lmh/q;

    return-object v0
.end method
