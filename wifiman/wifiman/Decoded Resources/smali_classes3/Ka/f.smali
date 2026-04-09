.class public final LKa/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKa/f$a;,
        LKa/f$b;,
        LKa/f$c;
    }
.end annotation


# static fields
.field public static final a:LKa/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LKa/f;

    invoke-direct {v0}, LKa/f;-><init>()V

    sput-object v0, LKa/f;->a:LKa/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;LLa/c;)LKa/f$a;
    .locals 1

    const-string/jumbo v0, "clientApp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LKa/g;

    invoke-direct {v0, p1, p2}, LKa/g;-><init>(Ljava/lang/String;LLa/c;)V

    return-object v0
.end method
