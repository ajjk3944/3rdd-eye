.class final Laa/c$b$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/c$b$c;->a(LA/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Laa/c$b$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laa/c$b$c$a;

    invoke-direct {v0}, Laa/c$b$c$a;-><init>()V

    sput-object v0, Laa/c$b$c$a;->a:Laa/c$b$c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LZ9/a;)Ljava/lang/Object;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LZ9/a;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ9/a;

    invoke-virtual {p0, p1}, Laa/c$b$c$a;->a(LZ9/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
