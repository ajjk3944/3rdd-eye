.class final LN4/a$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ4/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "h"
.end annotation


# static fields
.field static final a:LN4/a$h;

.field private static final b:LZ4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN4/a$h;

    invoke-direct {v0}, LN4/a$h;-><init>()V

    sput-object v0, LN4/a$h;->a:LN4/a$h;

    const-string/jumbo v0, "clsId"

    invoke-static {v0}, LZ4/b;->d(Ljava/lang/String;)LZ4/b;

    move-result-object v0

    sput-object v0, LN4/a$h;->b:LZ4/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    check-cast p2, LZ4/d;

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, LN4/a$h;->b(LN4/F$e$a$b;LZ4/d;)V

    return-void
.end method

.method public b(LN4/F$e$a$b;LZ4/d;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
