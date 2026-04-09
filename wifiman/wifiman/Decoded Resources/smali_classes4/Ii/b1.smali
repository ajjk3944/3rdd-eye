.class public final LIi/b1;
.super Ldh/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIi/b1$a;
    }
.end annotation


# static fields
.field public static final c:LIi/b1$a;


# instance fields
.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LIi/b1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LIi/b1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LIi/b1;->c:LIi/b1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, LIi/b1;->c:LIi/b1$a;

    invoke-direct {p0, v0}, Ldh/a;-><init>(Ldh/i$c;)V

    return-void
.end method
