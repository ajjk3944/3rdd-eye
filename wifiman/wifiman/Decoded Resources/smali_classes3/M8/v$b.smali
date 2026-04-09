.class final LM8/v$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/v;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/v$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/v$b;

    invoke-direct {v0}, LM8/v$b;-><init>()V

    sput-object v0, LM8/v$b;->a:LM8/v$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/E;)Lic/d;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lde/E;->f()Lic/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/E;

    invoke-virtual {p0, p1}, LM8/v$b;->a(Lde/E;)Lic/d;

    move-result-object p1

    return-object p1
.end method
