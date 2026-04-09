.class public final LJ0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJ0/r;

.field private static final b:LJ0/v;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LJ0/r;

    invoke-direct {v0}, LJ0/r;-><init>()V

    sput-object v0, LJ0/r;->a:LJ0/r;

    new-instance v0, LJ0/v;

    const/4 v1, 0x0

    sget-object v2, LJ0/r$a;->a:LJ0/r$a;

    const-string v3, "TestTagsAsResourceId"

    invoke-direct {v0, v3, v1, v2}, LJ0/v;-><init>(Ljava/lang/String;ZLmh/p;)V

    sput-object v0, LJ0/r;->b:LJ0/v;

    const/16 v0, 0x8

    sput v0, LJ0/r;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LJ0/v;
    .locals 1

    sget-object v0, LJ0/r;->b:LJ0/v;

    return-object v0
.end method
