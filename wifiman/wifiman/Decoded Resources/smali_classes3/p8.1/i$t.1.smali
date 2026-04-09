.class final Lp8/i$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/i;->c1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lp8/i$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp8/i$t;

    invoke-direct {v0}, Lp8/i$t;-><init>()V

    sput-object v0, Lp8/i$t;->a:Lp8/i$t;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDc/e$b;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, LDc/e$b$a$b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDc/e$b;

    invoke-virtual {p0, p1}, Lp8/i$t;->a(LDc/e$b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
