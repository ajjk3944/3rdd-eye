.class final LM8/g$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/g;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/g$s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/g$s;

    invoke-direct {v0}, LM8/g$s;-><init>()V

    sput-object v0, LM8/g$s;->a:LM8/g$s;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCf/c;)Ls9/d$c;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/d$c;

    invoke-virtual {p1}, LCf/c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCf/c;

    invoke-virtual {p0, p1}, LM8/g$s;->a(LCf/c;)Ls9/d$c;

    move-result-object p1

    return-object p1
.end method
