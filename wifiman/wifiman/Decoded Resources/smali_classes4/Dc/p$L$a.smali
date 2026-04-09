.class final LDc/p$L$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/p$L;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LDc/p$L$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LDc/p$L$a;

    invoke-direct {v0}, LDc/p$L$a;-><init>()V

    sput-object v0, LDc/p$L$a;->a:LDc/p$L$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LKc/a$c;Ljava/lang/Integer;)LDc/e$b$a;
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LKc/a$c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, LDc/e$b$a$a;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {p1, p2}, LDc/e$b$a$a;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, LDc/e$b$a$b;

    invoke-virtual {p1}, LKc/a$c;->b()F

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, LDc/e$b$a$b;-><init>(FI)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKc/a$c;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, LDc/p$L$a;->a(LKc/a$c;Ljava/lang/Integer;)LDc/e$b$a;

    move-result-object p1

    return-object p1
.end method
