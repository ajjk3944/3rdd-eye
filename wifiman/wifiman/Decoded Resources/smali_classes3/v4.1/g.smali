.class public final Lv4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/g$b;
    }
.end annotation


# static fields
.field private static final b:Lv4/g;

.field private static final c:Lv4/g$b;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv4/g;

    invoke-direct {v0}, Lv4/g;-><init>()V

    sput-object v0, Lv4/g;->b:Lv4/g;

    new-instance v0, Lv4/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv4/g$b;-><init>(Lv4/g$a;)V

    sput-object v0, Lv4/g;->c:Lv4/g$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lv4/g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static b()Lv4/g;
    .locals 1

    sget-object v0, Lv4/g;->b:Lv4/g;

    return-object v0
.end method


# virtual methods
.method public a()Ly4/b;
    .locals 1

    iget-object v0, p0, Lv4/g;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly4/b;

    if-nez v0, :cond_0

    sget-object v0, Lv4/g;->c:Lv4/g$b;

    :cond_0
    return-object v0
.end method
