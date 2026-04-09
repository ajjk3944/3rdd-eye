.class public final LYh/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LYh/c;

.field private static final b:LWh/b$b;

.field private static final c:LWh/b$b;

.field private static final d:LWh/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYh/c;

    invoke-direct {v0}, LYh/c;-><init>()V

    sput-object v0, LYh/c;->a:LYh/c;

    invoke-static {}, LWh/b$d;->c()LWh/b$b;

    move-result-object v0

    sput-object v0, LYh/c;->b:LWh/b$b;

    invoke-static {}, LWh/b$d;->c()LWh/b$b;

    move-result-object v0

    sput-object v0, LYh/c;->c:LWh/b$b;

    invoke-static {v0}, LWh/b$d;->b(LWh/b$d;)LWh/b$b;

    move-result-object v0

    sput-object v0, LYh/c;->d:LWh/b$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LWh/b$b;
    .locals 1

    sget-object v0, LYh/c;->b:LWh/b$b;

    return-object v0
.end method
