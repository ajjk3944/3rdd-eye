.class final LM8/b$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/b$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$p;

    invoke-direct {v0}, LM8/b$p;-><init>()V

    sput-object v0, LM8/b$p;->a:LM8/b$p;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a$b;

    new-instance v0, Ll9/a;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lp8/l;->b(LCc/a;)LMe/g;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Lp8/l;->a(LCc/a;)LMe/c;

    move-result-object p1

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, LM8/b$p;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
