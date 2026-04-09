.class final LH8/l$o;
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
.field public static final a:LH8/l$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/l$o;

    invoke-direct {v0}, LH8/l$o;-><init>()V

    sput-object v0, LH8/l$o;->a:LH8/l$o;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LH8/l$b;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-virtual {p1}, LH8/l$b;->f()Ls9/d;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LH8/l$b;

    invoke-virtual {p0, p1}, LH8/l$o;->a(LH8/l$b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
