.class public final LBh/j0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBh/j0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBh/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LBh/j0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LBh/j0$a;

    invoke-direct {v0}, LBh/j0$a;-><init>()V

    sput-object v0, LBh/j0$a;->a:LBh/j0$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lpi/v0;Ljava/util/Collection;Lmh/l;Lmh/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "currentTypeConstructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "superTypes"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "neighbors"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "reportLoop"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method
