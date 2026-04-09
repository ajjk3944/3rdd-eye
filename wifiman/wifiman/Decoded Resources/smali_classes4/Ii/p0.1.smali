.class public abstract LIi/p0;
.super LIi/J;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIi/p0$a;
    }
.end annotation


# static fields
.field public static final c:LIi/p0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LIi/p0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LIi/p0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LIi/p0;->c:LIi/p0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LIi/J;-><init>()V

    return-void
.end method
