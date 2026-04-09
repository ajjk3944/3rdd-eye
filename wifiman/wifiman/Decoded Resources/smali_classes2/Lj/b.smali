.class public abstract LLj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLj/b$a;,
        LLj/b$b;
    }
.end annotation


# static fields
.field private static final a:Landroid/graphics/Rect;

.field private static final b:LLj/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, LLj/b;->a:Landroid/graphics/Rect;

    sget-object v0, LLj/b$b;->TOP_LEFT:LLj/b$b;

    sput-object v0, LLj/b;->b:LLj/b$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LLj/b$a;
    .locals 2

    new-instance v0, LLj/a$b;

    invoke-direct {v0}, LLj/a$b;-><init>()V

    sget-object v1, LLj/b;->a:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, LLj/a$b;->e(Landroid/graphics/Rect;)LLj/b$a;

    move-result-object v0

    sget-object v1, LLj/b;->b:LLj/b$b;

    invoke-virtual {v0, v1}, LLj/b$a;->d(LLj/b$b;)LLj/b$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()LLj/b$b;
.end method

.method public abstract c()Landroid/graphics/Rect;
.end method
