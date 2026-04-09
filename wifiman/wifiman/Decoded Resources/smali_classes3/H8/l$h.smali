.class final LH8/l$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/l;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/l$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/l$h;

    invoke-direct {v0}, LH8/l$h;-><init>()V

    sput-object v0, LH8/l$h;->a:LH8/l$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LH8/l$b;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LH8/l$b;->a()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LH8/l$b;

    invoke-virtual {p0, p1}, LH8/l$h;->a(LH8/l$b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
