.class public final LHe/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LHe/d;

.field public static b:Lmh/q;

.field public static c:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LHe/d;

    invoke-direct {v0}, LHe/d;-><init>()V

    sput-object v0, LHe/d;->a:LHe/d;

    sget-object v0, LHe/d$a;->a:LHe/d$a;

    const v1, -0x1338191c

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LHe/d;->b:Lmh/q;

    const v0, 0x7aa9f363

    sget-object v1, LHe/d$b;->a:LHe/d$b;

    invoke-static {v0, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v0

    sput-object v0, LHe/d;->c:Lmh/p;

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

    sget-object v0, LHe/d;->b:Lmh/q;

    return-object v0
.end method
