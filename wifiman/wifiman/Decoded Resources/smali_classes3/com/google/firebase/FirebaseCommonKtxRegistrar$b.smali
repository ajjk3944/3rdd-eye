.class public final Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF4/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/FirebaseCommonKtxRegistrar;->getComponents()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final a:Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;

    invoke-direct {v0}, Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;-><init>()V

    sput-object v0, Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;->a:Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LF4/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/firebase/FirebaseCommonKtxRegistrar$b;->b(LF4/d;)LIi/J;

    move-result-object p1

    return-object p1
.end method

.method public final b(LF4/d;)LIi/J;
    .locals 2

    const-class v0, LE4/c;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v0

    invoke-interface {p1, v0}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v0, "c.get(Qualified.qualifie\u2026a, Executor::class.java))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-static {p1}, LIi/r0;->a(Ljava/util/concurrent/Executor;)LIi/J;

    move-result-object p1

    return-object p1
.end method
