.class final LDc/p$L$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/p$L;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LDc/p$L$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LDc/p$L$b;

    invoke-direct {v0}, LDc/p$L$b;-><init>()V

    sput-object v0, LDc/p$L$b;->a:LDc/p$L$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)LDc/e$b$a$a;
    .locals 1

    const-string v0, "deviceCount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LDc/e$b$a$a;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v0, p1}, LDc/e$b$a$a;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LDc/p$L$b;->a(Ljava/lang/Integer;)LDc/e$b$a$a;

    move-result-object p1

    return-object p1
.end method
