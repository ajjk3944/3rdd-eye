.class public abstract LE/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LE/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE/c$a;

    invoke-direct {v0}, LE/c$a;-><init>()V

    sput-object v0, LE/c;->a:LE/b;

    return-void
.end method

.method public static final a(F)LE/b;
    .locals 1

    new-instance v0, LE/f;

    invoke-direct {v0, p0}, LE/f;-><init>(F)V

    return-object v0
.end method

.method public static final b(I)LE/b;
    .locals 1

    new-instance v0, LE/e;

    int-to-float p0, p0

    invoke-direct {v0, p0}, LE/e;-><init>(F)V

    return-object v0
.end method

.method public static final c(F)LE/b;
    .locals 2

    new-instance v0, LE/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LE/d;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
