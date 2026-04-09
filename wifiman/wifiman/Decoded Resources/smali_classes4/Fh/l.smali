.class public final LFh/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPh/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFh/l$a;
    }
.end annotation


# static fields
.field public static final a:LFh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LFh/l;

    invoke-direct {v0}, LFh/l;-><init>()V

    sput-object v0, LFh/l;->a:LFh/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LQh/l;)LPh/a;
    .locals 1

    const-string v0, "javaElement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFh/l$a;

    check-cast p1, LGh/u;

    invoke-direct {v0, p1}, LFh/l$a;-><init>(LGh/u;)V

    return-object v0
.end method
