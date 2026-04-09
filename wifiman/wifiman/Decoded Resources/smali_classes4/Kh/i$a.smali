.class public final LKh/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKh/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKh/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LKh/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LKh/i$a;

    invoke-direct {v0}, LKh/i$a;-><init>()V

    sput-object v0, LKh/i$a;->a:LKh/i$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LQh/n;LBh/Y;)Ldi/g;
    .locals 1

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "descriptor"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
