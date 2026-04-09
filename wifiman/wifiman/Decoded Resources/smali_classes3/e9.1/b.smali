.class public final Le9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le9/b;

.field private static b:Li9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le9/b;

    invoke-direct {v0}, Le9/b;-><init>()V

    sput-object v0, Le9/b;->a:Le9/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Li9/a;
    .locals 1

    sget-object v0, Le9/b;->b:Li9/a;

    return-object v0
.end method

.method public final b(Li9/a;)V
    .locals 0

    sput-object p1, Le9/b;->b:Li9/a;

    return-void
.end method
