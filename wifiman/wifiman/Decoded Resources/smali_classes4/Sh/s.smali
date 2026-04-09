.class public abstract LSh/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSh/s$a;,
        LSh/s$b;,
        LSh/s$c;,
        LSh/s$d;
    }
.end annotation


# static fields
.field public static final a:LSh/s$b;

.field private static final b:LSh/s$d;

.field private static final c:LSh/s$d;

.field private static final d:LSh/s$d;

.field private static final e:LSh/s$d;

.field private static final f:LSh/s$d;

.field private static final g:LSh/s$d;

.field private static final h:LSh/s$d;

.field private static final i:LSh/s$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LSh/s$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSh/s$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LSh/s;->a:LSh/s$b;

    new-instance v0, LSh/s$d;

    sget-object v1, Lgi/e;->BOOLEAN:Lgi/e;

    invoke-direct {v0, v1}, LSh/s$d;-><init>(Lgi/e;)V

    sput-object v0, LSh/s;->b:LSh/s$d;

    new-instance v0, LSh/s$d;

    sget-object v1, Lgi/e;->CHAR:Lgi/e;

    invoke-direct {v0, v1}, LSh/s$d;-><init>(Lgi/e;)V

    sput-object v0, LSh/s;->c:LSh/s$d;

    new-instance v0, LSh/s$d;

    sget-object v1, Lgi/e;->BYTE:Lgi/e;

    invoke-direct {v0, v1}, LSh/s$d;-><init>(Lgi/e;)V

    sput-object v0, LSh/s;->d:LSh/s$d;

    new-instance v0, LSh/s$d;

    sget-object v1, Lgi/e;->SHORT:Lgi/e;

    invoke-direct {v0, v1}, LSh/s$d;-><init>(Lgi/e;)V

    sput-object v0, LSh/s;->e:LSh/s$d;

    new-instance v0, LSh/s$d;

    sget-object v1, Lgi/e;->INT:Lgi/e;

    invoke-direct {v0, v1}, LSh/s$d;-><init>(Lgi/e;)V

    sput-object v0, LSh/s;->f:LSh/s$d;

    new-instance v0, LSh/s$d;

    sget-object v1, Lgi/e;->FLOAT:Lgi/e;

    invoke-direct {v0, v1}, LSh/s$d;-><init>(Lgi/e;)V

    sput-object v0, LSh/s;->g:LSh/s$d;

    new-instance v0, LSh/s$d;

    sget-object v1, Lgi/e;->LONG:Lgi/e;

    invoke-direct {v0, v1}, LSh/s$d;-><init>(Lgi/e;)V

    sput-object v0, LSh/s;->h:LSh/s$d;

    new-instance v0, LSh/s$d;

    sget-object v1, Lgi/e;->DOUBLE:Lgi/e;

    invoke-direct {v0, v1}, LSh/s$d;-><init>(Lgi/e;)V

    sput-object v0, LSh/s;->i:LSh/s$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LSh/s;-><init>()V

    return-void
.end method

.method public static final synthetic a()LSh/s$d;
    .locals 1

    sget-object v0, LSh/s;->b:LSh/s$d;

    return-object v0
.end method

.method public static final synthetic b()LSh/s$d;
    .locals 1

    sget-object v0, LSh/s;->d:LSh/s$d;

    return-object v0
.end method

.method public static final synthetic c()LSh/s$d;
    .locals 1

    sget-object v0, LSh/s;->c:LSh/s$d;

    return-object v0
.end method

.method public static final synthetic d()LSh/s$d;
    .locals 1

    sget-object v0, LSh/s;->i:LSh/s$d;

    return-object v0
.end method

.method public static final synthetic e()LSh/s$d;
    .locals 1

    sget-object v0, LSh/s;->g:LSh/s$d;

    return-object v0
.end method

.method public static final synthetic f()LSh/s$d;
    .locals 1

    sget-object v0, LSh/s;->f:LSh/s$d;

    return-object v0
.end method

.method public static final synthetic g()LSh/s$d;
    .locals 1

    sget-object v0, LSh/s;->h:LSh/s$d;

    return-object v0
.end method

.method public static final synthetic h()LSh/s$d;
    .locals 1

    sget-object v0, LSh/s;->e:LSh/s$d;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, LSh/u;->a:LSh/u;

    invoke-virtual {v0, p0}, LSh/u;->l(LSh/s;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
