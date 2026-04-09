.class public final synthetic Lcom/ui/wifiman/ui/sso/logout/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/ui/sso/logout/b;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/ui/sso/logout/b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/sso/logout/c;->a:Lcom/ui/wifiman/ui/sso/logout/b;

    iput p2, p0, Lcom/ui/wifiman/ui/sso/logout/c;->b:I

    iput p3, p0, Lcom/ui/wifiman/ui/sso/logout/c;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/ui/sso/logout/c;->a:Lcom/ui/wifiman/ui/sso/logout/b;

    iget v1, p0, Lcom/ui/wifiman/ui/sso/logout/c;->b:I

    iget v2, p0, Lcom/ui/wifiman/ui/sso/logout/c;->c:I

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/ui/wifiman/ui/sso/logout/f;->a(Lcom/ui/wifiman/ui/sso/logout/b;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
