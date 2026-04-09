.class public final LT8/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:LT8/a$b;

.field private static b:Li9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LT8/a$b;

    invoke-direct {v0}, LT8/a$b;-><init>()V

    sput-object v0, LT8/a$b;->a:LT8/a$b;

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

    sget-object v0, LT8/a$b;->b:Li9/a;

    return-object v0
.end method

.method public final b(Li9/a;)V
    .locals 0

    sput-object p1, LT8/a$b;->b:Li9/a;

    return-void
.end method
